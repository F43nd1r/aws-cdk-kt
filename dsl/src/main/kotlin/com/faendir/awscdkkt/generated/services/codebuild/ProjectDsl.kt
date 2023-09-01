package com.faendir.awscdkkt.generated.services.codebuild

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.Project
import software.amazon.awscdk.services.codebuild.ProjectProps
import software.constructs.Construct

@Generated
public fun Construct.project(
  id: String,
  props: ProjectProps,
  initializer: @AwsCdkDsl Project.() -> Unit = {},
): Project = Project(this, id, props).apply(initializer)

@Generated
public fun Construct.buildProject(id: String, initializer: @AwsCdkDsl Project.Builder.() -> Unit =
    {}): Project = Project.Builder.create(this, id).apply(initializer).build()
