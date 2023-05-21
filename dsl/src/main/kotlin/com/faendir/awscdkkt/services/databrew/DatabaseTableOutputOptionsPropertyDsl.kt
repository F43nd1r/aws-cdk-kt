package com.faendir.awscdkkt.services.databrew

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.databrew.CfnJob

@Generated
public
    fun databaseTableOutputOptionsProperty(initializer: CfnJob.DatabaseTableOutputOptionsProperty.Builder.() -> Unit
    = {}): CfnJob.DatabaseTableOutputOptionsProperty =
    CfnJob.DatabaseTableOutputOptionsProperty.builder().apply(initializer).build()
