package com.faendir.awscdkkt.generated.services.inspectorv2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.inspectorv2.CfnFilter
import software.amazon.awscdk.services.inspectorv2.CfnFilterProps
import software.constructs.Construct

@Generated
public fun Construct.cfnFilter(
  id: String,
  props: CfnFilterProps,
  initializer: @AwsCdkDsl CfnFilter.() -> Unit = {},
): CfnFilter = CfnFilter(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnFilter(id: String, initializer: @AwsCdkDsl CfnFilter.Builder.() -> Unit = {}): CfnFilter = CfnFilter.Builder.create(this, id).apply(initializer).build()
