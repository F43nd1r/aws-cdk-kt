@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.DatabaseProxyOptions

public fun databaseProxyOptions(initializer: DatabaseProxyOptions.Builder.() -> Unit):
    DatabaseProxyOptions = DatabaseProxyOptions.builder().apply(initializer).build()
