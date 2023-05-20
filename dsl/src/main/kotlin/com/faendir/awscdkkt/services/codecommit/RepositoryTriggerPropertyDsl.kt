@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.codecommit

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codecommit.CfnRepository

public
    fun repositoryTriggerProperty(initializer: CfnRepository.RepositoryTriggerProperty.Builder.() -> Unit):
    CfnRepository.RepositoryTriggerProperty =
    CfnRepository.RepositoryTriggerProperty.builder().apply(initializer).build()
