package com.faendir.awscdkkt.services.docdb

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.docdb.Login

@Generated
public fun login(initializer: Login.Builder.() -> Unit = {}): Login =
    Login.builder().apply(initializer).build()
