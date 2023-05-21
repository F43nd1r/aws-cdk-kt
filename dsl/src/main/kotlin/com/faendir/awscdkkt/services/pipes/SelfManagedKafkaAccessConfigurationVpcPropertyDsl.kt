package com.faendir.awscdkkt.services.pipes

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.pipes.CfnPipe

@Generated
public
    fun selfManagedKafkaAccessConfigurationVpcProperty(initializer: CfnPipe.SelfManagedKafkaAccessConfigurationVpcProperty.Builder.() -> Unit
    = {}): CfnPipe.SelfManagedKafkaAccessConfigurationVpcProperty =
    CfnPipe.SelfManagedKafkaAccessConfigurationVpcProperty.builder().apply(initializer).build()
