package com.faendir.awscdkkt.services.codepipeline.actions

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.actions.JenkinsProvider
import software.amazon.awscdk.services.codepipeline.actions.JenkinsProviderProps
import software.constructs.Construct

@Generated
public fun Construct.jenkinsProvider(
  id: String,
  props: JenkinsProviderProps,
  initializer: JenkinsProvider.() -> Unit = {},
): JenkinsProvider = JenkinsProvider(this, id, props).apply(initializer)
