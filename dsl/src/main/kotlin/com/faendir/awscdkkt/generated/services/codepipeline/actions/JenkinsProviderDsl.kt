package com.faendir.awscdkkt.generated.services.codepipeline.actions

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl JenkinsProvider.() -> Unit = {},
): JenkinsProvider = JenkinsProvider(this, id, props).apply(initializer)

@Generated
public fun Construct.buildJenkinsProvider(id: String, initializer: @AwsCdkDsl JenkinsProvider.Builder.() -> Unit = {}): JenkinsProvider = JenkinsProvider.Builder.create(this, id).apply(initializer).build()
