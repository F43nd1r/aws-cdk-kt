package com.faendir.awscdkkt.generated.services.cases

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cases.CfnLayout
import software.amazon.awscdk.services.cases.CfnLayoutProps
import software.constructs.Construct

@Generated
public fun Construct.cfnLayout(
  id: String,
  props: CfnLayoutProps,
  initializer: @AwsCdkDsl CfnLayout.() -> Unit = {},
): CfnLayout = CfnLayout(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnLayout(id: String, initializer: @AwsCdkDsl CfnLayout.Builder.() -> Unit = {}): CfnLayout = CfnLayout.Builder.create(this, id).apply(initializer).build()
