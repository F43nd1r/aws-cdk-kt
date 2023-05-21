package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnTaskDefinition

@Generated
public
    fun repositoryCredentialsProperty(initializer: CfnTaskDefinition.RepositoryCredentialsProperty.Builder.() -> Unit
    = {}): CfnTaskDefinition.RepositoryCredentialsProperty =
    CfnTaskDefinition.RepositoryCredentialsProperty.builder().apply(initializer).build()
