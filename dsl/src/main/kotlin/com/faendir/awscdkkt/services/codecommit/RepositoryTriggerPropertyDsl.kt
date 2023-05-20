@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.codecommit

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codecommit.CfnRepository

public
    fun repositoryTriggerProperty(initializer: CfnRepository.RepositoryTriggerProperty.Builder.() -> Unit):
    CfnRepository.RepositoryTriggerProperty =
    CfnRepository.RepositoryTriggerProperty.builder().apply(initializer).build()
