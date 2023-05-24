package com.faendir.awscdkkt.generated.services.fms

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.fms.CfnResourceSet
import software.amazon.awscdk.services.fms.CfnResourceSetProps
import software.constructs.Construct

@Generated
public fun Construct.cfnResourceSet(id: String, props: CfnResourceSetProps): CfnResourceSet =
    CfnResourceSet(this, id, props)

@Generated
public fun Construct.cfnResourceSet(
  id: String,
  props: CfnResourceSetProps,
  initializer: @AwsCdkDsl CfnResourceSet.() -> Unit,
): CfnResourceSet = CfnResourceSet(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnResourceSet(id: String, initializer: @AwsCdkDsl
    CfnResourceSet.Builder.() -> Unit): CfnResourceSet = CfnResourceSet.Builder.create(this,
    id).apply(initializer).build()
