package com.faendir.awscdkkt.generated.services.imagebuilder

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.imagebuilder.CfnAllImageBuildVersions
import software.amazon.awscdk.services.imagebuilder.CfnAllImageBuildVersionsProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAllImageBuildVersions(id: String, initializer: @AwsCdkDsl CfnAllImageBuildVersions.() -> Unit = {}): CfnAllImageBuildVersions = CfnAllImageBuildVersions(this, id).apply(initializer)

@Generated
public fun Construct.cfnAllImageBuildVersions(
  id: String,
  props: CfnAllImageBuildVersionsProps,
  initializer: @AwsCdkDsl CfnAllImageBuildVersions.() -> Unit = {},
): CfnAllImageBuildVersions = CfnAllImageBuildVersions(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnAllImageBuildVersions(id: String, initializer: @AwsCdkDsl CfnAllImageBuildVersions.Builder.() -> Unit = {}): CfnAllImageBuildVersions = CfnAllImageBuildVersions.Builder.create(this, id).apply(initializer).build()
