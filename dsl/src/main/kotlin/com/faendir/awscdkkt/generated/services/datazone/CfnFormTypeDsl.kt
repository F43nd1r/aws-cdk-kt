package com.faendir.awscdkkt.generated.services.datazone

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.datazone.CfnFormType
import software.amazon.awscdk.services.datazone.CfnFormTypeProps
import software.constructs.Construct

@Generated
public fun Construct.cfnFormType(
  id: String,
  props: CfnFormTypeProps,
  initializer: @AwsCdkDsl CfnFormType.() -> Unit = {},
): CfnFormType = CfnFormType(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnFormType(id: String, initializer: @AwsCdkDsl CfnFormType.Builder.() -> Unit = {}): CfnFormType = CfnFormType.Builder.create(this, id).apply(initializer).build()
