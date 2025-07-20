package com.faendir.awscdkkt.generated.services.datazone

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.datazone.CfnOwner
import software.amazon.awscdk.services.datazone.CfnOwnerProps
import software.constructs.Construct

@Generated
public fun Construct.cfnOwner(
  id: String,
  props: CfnOwnerProps,
  initializer: @AwsCdkDsl CfnOwner.() -> Unit = {},
): CfnOwner = CfnOwner(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnOwner(id: String, initializer: @AwsCdkDsl CfnOwner.Builder.() -> Unit = {}): CfnOwner = CfnOwner.Builder.create(this, id).apply(initializer).build()
