@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.glue

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnDatabase

public fun databaseInputProperty(initializer: CfnDatabase.DatabaseInputProperty.Builder.() -> Unit):
    CfnDatabase.DatabaseInputProperty =
    CfnDatabase.DatabaseInputProperty.builder().apply(initializer).build()
