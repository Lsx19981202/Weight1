/*
 *  Copyright (C) 2015, Jhuster, All Rights Reserved
 *  Author:  Jhuster(lujun.hust@gmail.com)
 *  
 *  https://github.com/Jhuster/EWeightScale
 *  
 *  This program is free software; you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation; version 2 of the License.
 */
package com.jhuster.eweightscale;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;

public class AboutActivity extends Activity {


	@Override
	public boolean onOptionsItemSelected(MenuItem item) {        
	    switch (item.getItemId()) {
	    case android.R.id.home:
	         finish();
	    default:
	         break;
	    }
	    return true;
	}
}
