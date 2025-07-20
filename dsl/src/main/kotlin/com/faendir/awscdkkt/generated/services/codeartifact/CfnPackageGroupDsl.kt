package com.faendir.awscdkkt.generated.services.codeartifact

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codeartifact.CfnPackageGroup
import software.amazon.awscdk.services.codeartifact.CfnPackageGroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnPackageGroup(
  id: String,
  props: CfnPackageGroupProps,
  initializer: @AwsCdkDsl CfnPackageGroup.() -> Unit = {},
): CfnPackageGroup = CfnPackageGroup(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnPackageGroup(id: String, initializer: @AwsCdkDsl CfnPackageGroup.Builder.() -> Unit = {}): CfnPackageGroup = CfnPackageGroup.Builder.create(this, id).apply(initializer).build()
