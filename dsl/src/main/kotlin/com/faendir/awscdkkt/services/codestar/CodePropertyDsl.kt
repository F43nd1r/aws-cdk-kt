package com.faendir.awscdkkt.services.codestar

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codestar.CfnGitHubRepository

@Generated
public fun codeProperty(initializer: CfnGitHubRepository.CodeProperty.Builder.() -> Unit = {}):
    CfnGitHubRepository.CodeProperty =
    CfnGitHubRepository.CodeProperty.builder().apply(initializer).build()
