@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.codebuild

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.Project
import software.amazon.awscdk.services.codebuild.ProjectProps
import software.constructs.Construct

public fun Construct.project(
  id: String,
  props: ProjectProps,
  initializer: Project.() -> Unit = {},
): Project = Project(this, id, props).apply(initializer)
