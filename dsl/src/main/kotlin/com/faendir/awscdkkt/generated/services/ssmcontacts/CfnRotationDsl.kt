package com.faendir.awscdkkt.generated.services.ssmcontacts

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ssmcontacts.CfnRotation
import software.amazon.awscdk.services.ssmcontacts.CfnRotationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnRotation(
  id: String,
  props: CfnRotationProps,
  initializer: @AwsCdkDsl CfnRotation.() -> Unit = {},
): CfnRotation = CfnRotation(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnRotation(id: String, initializer: @AwsCdkDsl
    CfnRotation.Builder.() -> Unit = {}): CfnRotation = CfnRotation.Builder.create(this,
    id).apply(initializer).build()
