package com.faendir.awscdkkt.services.emrserverless

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.emrserverless.CfnApplication

@Generated
public
    fun workerTypeSpecificationInputProperty(initializer: CfnApplication.WorkerTypeSpecificationInputProperty.Builder.() -> Unit
    = {}): CfnApplication.WorkerTypeSpecificationInputProperty =
    CfnApplication.WorkerTypeSpecificationInputProperty.builder().apply(initializer).build()
