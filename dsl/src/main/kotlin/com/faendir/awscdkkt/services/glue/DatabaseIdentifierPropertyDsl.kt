@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.glue

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnDatabase

public
    fun databaseIdentifierProperty(initializer: CfnDatabase.DatabaseIdentifierProperty.Builder.() -> Unit):
    CfnDatabase.DatabaseIdentifierProperty =
    CfnDatabase.DatabaseIdentifierProperty.builder().apply(initializer).build()
