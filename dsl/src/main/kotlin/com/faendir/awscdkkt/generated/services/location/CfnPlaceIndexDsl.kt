package com.faendir.awscdkkt.generated.services.location

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.location.CfnPlaceIndex
import software.amazon.awscdk.services.location.CfnPlaceIndexProps
import software.constructs.Construct

@Generated
public fun Construct.cfnPlaceIndex(
  id: String,
  props: CfnPlaceIndexProps,
  initializer: @AwsCdkDsl CfnPlaceIndex.() -> Unit = {},
): CfnPlaceIndex = CfnPlaceIndex(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnPlaceIndex(id: String, initializer: @AwsCdkDsl CfnPlaceIndex.Builder.() -> Unit = {}): CfnPlaceIndex = CfnPlaceIndex.Builder.create(this, id).apply(initializer).build()
