package com.faendir.awscdkkt.services.codecommit

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codecommit.CfnRepository

@Generated
public
    fun repositoryTriggerProperty(initializer: CfnRepository.RepositoryTriggerProperty.Builder.() -> Unit
    = {}): CfnRepository.RepositoryTriggerProperty =
    CfnRepository.RepositoryTriggerProperty.builder().apply(initializer).build()
