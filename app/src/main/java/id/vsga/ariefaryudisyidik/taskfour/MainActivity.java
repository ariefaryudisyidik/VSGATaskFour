package id.vsga.ariefaryudisyidik.taskfour;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import id.vsga.ariefaryudisyidik.taskfour.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        onButtonClicked();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.option_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.repeat) {
            Toast.makeText(this, getString(R.string.repeat_menu_click), Toast.LENGTH_SHORT).show();
        } else if (item.getItemId() == R.id.exit) {
            finish();
        }
        return true;
    }

    private void onButtonClicked() {
        binding.btnA.setOnClickListener(view -> Toast.makeText(this, getString(R.string.a), Toast.LENGTH_SHORT).show());
        binding.btnB.setOnClickListener(view -> Toast.makeText(this, getString(R.string.b), Toast.LENGTH_SHORT).show());
        binding.btnC.setOnClickListener(view -> Toast.makeText(this, getString(R.string.c), Toast.LENGTH_SHORT).show());
        binding.btnD.setOnClickListener(view -> Toast.makeText(this, getString(R.string.d), Toast.LENGTH_SHORT).show());
        binding.btnE.setOnClickListener(view -> Toast.makeText(this, getString(R.string.e), Toast.LENGTH_SHORT).show());
        binding.btnF.setOnClickListener(view -> Toast.makeText(this, getString(R.string.f), Toast.LENGTH_SHORT).show());
        binding.btnG.setOnClickListener(view -> Toast.makeText(this, getString(R.string.g), Toast.LENGTH_SHORT).show());
        binding.btnH.setOnClickListener(view -> Toast.makeText(this, getString(R.string.h), Toast.LENGTH_SHORT).show());
        binding.btnI.setOnClickListener(view -> Toast.makeText(this, getString(R.string.i), Toast.LENGTH_SHORT).show());
        binding.btnJ.setOnClickListener(view -> Toast.makeText(this, getString(R.string.j), Toast.LENGTH_SHORT).show());
        binding.btnK.setOnClickListener(view -> Toast.makeText(this, getString(R.string.k), Toast.LENGTH_SHORT).show());
        binding.btnL.setOnClickListener(view -> Toast.makeText(this, getString(R.string.l), Toast.LENGTH_SHORT).show());
        binding.btnM.setOnClickListener(view -> Toast.makeText(this, getString(R.string.m), Toast.LENGTH_SHORT).show());
        binding.btnN.setOnClickListener(view -> Toast.makeText(this, getString(R.string.n), Toast.LENGTH_SHORT).show());
        binding.btnO.setOnClickListener(view -> Toast.makeText(this, getString(R.string.o), Toast.LENGTH_SHORT).show());
        binding.btnBlank.setOnClickListener(view -> Toast.makeText(this, getString(R.string.blank), Toast.LENGTH_SHORT).show());
    }
}