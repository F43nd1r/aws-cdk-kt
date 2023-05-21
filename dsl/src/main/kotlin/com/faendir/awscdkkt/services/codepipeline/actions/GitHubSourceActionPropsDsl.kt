package com.faendir.awscdkkt.services.codepipeline.actions

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.actions.GitHubSourceActionProps

@Generated
public fun gitHubSourceActionProps(initializer: GitHubSourceActionProps.Builder.() -> Unit = {}):
    GitHubSourceActionProps = GitHubSourceActionProps.builder().apply(initializer).build()
