package com.xd.test.brvahdemo.section;

import com.chad.library.adapter.base.entity.SectionEntity;
import com.xd.test.brvahdemo.bean.Bean;

/**
 * Created by Administrator on 2017/6/5 at 9:30
 * <p>
 * Copyright (C) 2017 By Administrator
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
public class Guanjia extends SectionEntity<Bean> {
    public Guanjia(boolean isHeader, String header) {
        super(isHeader, header);
    }

    public Guanjia(Bean bean) {
        super(bean);
    }
}
