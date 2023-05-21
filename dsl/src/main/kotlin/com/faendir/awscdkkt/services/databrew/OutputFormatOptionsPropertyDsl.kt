package com.faendir.awscdkkt.services.databrew

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.databrew.CfnJob

@Generated
public
    fun outputFormatOptionsProperty(initializer: CfnJob.OutputFormatOptionsProperty.Builder.() -> Unit
    = {}): CfnJob.OutputFormatOptionsProperty =
    CfnJob.OutputFormatOptionsProperty.builder().apply(initializer).build()
