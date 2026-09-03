package com.faendir.awscdkkt.generated.services.sagemaker

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnWorkforce
import software.amazon.awscdk.services.sagemaker.CfnWorkforceProps
import software.constructs.Construct

@Generated
public fun Construct.cfnWorkforce(
  id: String,
  props: CfnWorkforceProps,
  initializer: @AwsCdkDsl CfnWorkforce.() -> Unit = {},
): CfnWorkforce = CfnWorkforce(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnWorkforce(id: String, initializer: @AwsCdkDsl CfnWorkforce.Builder.() -> Unit = {}): CfnWorkforce = CfnWorkforce.Builder.create(this, id).apply(initializer).build()
