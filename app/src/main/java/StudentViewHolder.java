
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;

class StudentViewHolder extends RecyclerView.ViewHolder {

    TextView tvId, tvName;

    StudentViewHolder(@NonNull View itemView) {
        super(itemView);
        tvId = itemView.findViewById(R.id.tvId);
        tvName = itemView.findViewById(R.id.tvName);
    }
}
