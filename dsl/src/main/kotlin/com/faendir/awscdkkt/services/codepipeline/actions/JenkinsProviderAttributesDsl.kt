package com.faendir.awscdkkt.services.codepipeline.actions

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.actions.JenkinsProviderAttributes

@Generated
public fun jenkinsProviderAttributes(initializer: JenkinsProviderAttributes.Builder.() -> Unit =
    {}): JenkinsProviderAttributes = JenkinsProviderAttributes.builder().apply(initializer).build()
