package com.faendir.awscdkkt.services.batch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.batch.CfnComputeEnvironment

@Generated
public
    fun ec2ConfigurationObjectProperty(initializer: CfnComputeEnvironment.Ec2ConfigurationObjectProperty.Builder.() -> Unit
    = {}): CfnComputeEnvironment.Ec2ConfigurationObjectProperty =
    CfnComputeEnvironment.Ec2ConfigurationObjectProperty.builder().apply(initializer).build()
