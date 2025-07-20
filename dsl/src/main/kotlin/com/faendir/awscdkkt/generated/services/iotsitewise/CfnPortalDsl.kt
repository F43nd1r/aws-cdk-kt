package com.faendir.awscdkkt.generated.services.iotsitewise

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iotsitewise.CfnPortal
import software.amazon.awscdk.services.iotsitewise.CfnPortalProps
import software.constructs.Construct

@Generated
public fun Construct.cfnPortal(
  id: String,
  props: CfnPortalProps,
  initializer: @AwsCdkDsl CfnPortal.() -> Unit = {},
): CfnPortal = CfnPortal(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnPortal(id: String, initializer: @AwsCdkDsl CfnPortal.Builder.() -> Unit = {}): CfnPortal = CfnPortal.Builder.create(this, id).apply(initializer).build()
