package com.faendir.awscdkkt.services.emr

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.emr.CfnStep

@Generated
public
    fun hadoopJarStepConfigProperty(initializer: CfnStep.HadoopJarStepConfigProperty.Builder.() -> Unit
    = {}): CfnStep.HadoopJarStepConfigProperty =
    CfnStep.HadoopJarStepConfigProperty.builder().apply(initializer).build()
