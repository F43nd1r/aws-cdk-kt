package com.faendir.awscdkkt.services.pipes

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.pipes.CfnPipe

@Generated
public
    fun selfManagedKafkaAccessConfigurationCredentialsProperty(initializer: CfnPipe.SelfManagedKafkaAccessConfigurationCredentialsProperty.Builder.() -> Unit
    = {}): CfnPipe.SelfManagedKafkaAccessConfigurationCredentialsProperty =
    CfnPipe.SelfManagedKafkaAccessConfigurationCredentialsProperty.builder().apply(initializer).build()
