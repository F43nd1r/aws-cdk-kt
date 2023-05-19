@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.codepipeline.actions

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.actions.JenkinsProvider
import software.amazon.awscdk.services.codepipeline.actions.JenkinsProviderProps
import software.constructs.Construct

public fun Construct.jenkinsProvider(
  id: String,
  props: JenkinsProviderProps,
  initializer: JenkinsProvider.() -> Unit = {},
): JenkinsProvider = JenkinsProvider(this, id, props).apply(initializer)
