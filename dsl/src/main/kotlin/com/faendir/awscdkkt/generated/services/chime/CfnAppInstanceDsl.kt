package com.faendir.awscdkkt.generated.services.chime

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.chime.CfnAppInstance
import software.amazon.awscdk.services.chime.CfnAppInstanceProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAppInstance(
  id: String,
  props: CfnAppInstanceProps,
  initializer: @AwsCdkDsl CfnAppInstance.() -> Unit = {},
): CfnAppInstance = CfnAppInstance(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnAppInstance(id: String, initializer: @AwsCdkDsl CfnAppInstance.Builder.() -> Unit = {}): CfnAppInstance = CfnAppInstance.Builder.create(this, id).apply(initializer).build()
