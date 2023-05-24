package com.faendir.awscdkkt.generated.services.sagemaker

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnSpace
import software.amazon.awscdk.services.sagemaker.CfnSpaceProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSpace(id: String, props: CfnSpaceProps): CfnSpace = CfnSpace(this, id,
    props)

@Generated
public fun Construct.cfnSpace(
  id: String,
  props: CfnSpaceProps,
  initializer: @AwsCdkDsl CfnSpace.() -> Unit,
): CfnSpace = CfnSpace(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnSpace(id: String, initializer: @AwsCdkDsl CfnSpace.Builder.() -> Unit):
    CfnSpace = CfnSpace.Builder.create(this, id).apply(initializer).build()
