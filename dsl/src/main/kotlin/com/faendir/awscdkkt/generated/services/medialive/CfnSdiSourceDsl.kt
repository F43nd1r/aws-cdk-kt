package com.faendir.awscdkkt.generated.services.medialive

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.medialive.CfnSdiSource
import software.amazon.awscdk.services.medialive.CfnSdiSourceProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSdiSource(
  id: String,
  props: CfnSdiSourceProps,
  initializer: @AwsCdkDsl CfnSdiSource.() -> Unit = {},
): CfnSdiSource = CfnSdiSource(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnSdiSource(id: String, initializer: @AwsCdkDsl CfnSdiSource.Builder.() -> Unit = {}): CfnSdiSource = CfnSdiSource.Builder.create(this, id).apply(initializer).build()
