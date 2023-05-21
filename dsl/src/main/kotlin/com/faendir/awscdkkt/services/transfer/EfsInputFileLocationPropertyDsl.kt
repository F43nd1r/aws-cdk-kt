package com.faendir.awscdkkt.services.transfer

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.transfer.CfnWorkflow

@Generated
public
    fun efsInputFileLocationProperty(initializer: CfnWorkflow.EfsInputFileLocationProperty.Builder.() -> Unit
    = {}): CfnWorkflow.EfsInputFileLocationProperty =
    CfnWorkflow.EfsInputFileLocationProperty.builder().apply(initializer).build()
