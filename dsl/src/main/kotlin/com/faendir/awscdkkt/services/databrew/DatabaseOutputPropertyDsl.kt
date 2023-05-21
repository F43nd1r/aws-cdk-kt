package com.faendir.awscdkkt.services.databrew

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.databrew.CfnJob

@Generated
public fun databaseOutputProperty(initializer: CfnJob.DatabaseOutputProperty.Builder.() -> Unit =
    {}): CfnJob.DatabaseOutputProperty =
    CfnJob.DatabaseOutputProperty.builder().apply(initializer).build()
