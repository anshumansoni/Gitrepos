package com.example.gitrepos.ui.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gitrepos.R;
import com.example.gitrepos.models.GithubRepository;
import com.google.android.material.textview.MaterialTextView;


import java.util.ArrayList;
import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.UserRepoView> {

    Context currentContext;
    private ArrayList<GithubRepository> githubRepository;

    public RecyclerViewAdapter(Context applicationContext, ArrayList<GithubRepository> currentRepository) {

        this.currentContext = applicationContext;
        this.githubRepository = currentRepository;
    }

    static class UserRepoView  extends RecyclerView.ViewHolder{

        private MaterialTextView userRepo;

        UserRepoView(@NonNull View itemView) {
            super(itemView);

            userRepo = itemView.findViewById(R.id.userRepo);
        }
    }

    @NonNull
    @Override
    public UserRepoView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View repoList = LayoutInflater.from(currentContext)
                .inflate(R.layout.user_repos, parent, false);

        return new UserRepoView(repoList);
    }

    @Override
    public void onBindViewHolder(@NonNull UserRepoView holder, int position) {

        GithubRepository currentRepo = githubRepository.get(position);

        holder.userRepo.setText(currentRepo.getName());
    }

    @Override
    public int getItemCount() {
        return githubRepository.size();
    }
}
