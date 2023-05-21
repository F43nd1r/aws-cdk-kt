package com.faendir.awscdkkt.services.databrew

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.databrew.CfnJob

@Generated
public fun csvOutputOptionsProperty(initializer: CfnJob.CsvOutputOptionsProperty.Builder.() -> Unit
    = {}): CfnJob.CsvOutputOptionsProperty =
    CfnJob.CsvOutputOptionsProperty.builder().apply(initializer).build()
