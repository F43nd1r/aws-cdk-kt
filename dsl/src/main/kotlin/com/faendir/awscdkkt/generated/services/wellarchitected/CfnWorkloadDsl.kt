package com.faendir.awscdkkt.generated.services.wellarchitected

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.wellarchitected.CfnWorkload
import software.amazon.awscdk.services.wellarchitected.CfnWorkloadProps
import software.constructs.Construct

@Generated
public fun Construct.cfnWorkload(
  id: String,
  props: CfnWorkloadProps,
  initializer: @AwsCdkDsl CfnWorkload.() -> Unit = {},
): CfnWorkload = CfnWorkload(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnWorkload(id: String, initializer: @AwsCdkDsl CfnWorkload.Builder.() -> Unit = {}): CfnWorkload = CfnWorkload.Builder.create(this, id).apply(initializer).build()
