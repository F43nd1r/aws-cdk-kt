package com.faendir.awscdkkt.generated.services.ses

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ses.CfnMailManagerAddonInstance
import software.amazon.awscdk.services.ses.CfnMailManagerAddonInstanceProps
import software.constructs.Construct

@Generated
public fun Construct.cfnMailManagerAddonInstance(
  id: String,
  props: CfnMailManagerAddonInstanceProps,
  initializer: @AwsCdkDsl CfnMailManagerAddonInstance.() -> Unit = {},
): CfnMailManagerAddonInstance = CfnMailManagerAddonInstance(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnMailManagerAddonInstance(id: String, initializer: @AwsCdkDsl
    CfnMailManagerAddonInstance.Builder.() -> Unit = {}): CfnMailManagerAddonInstance =
    CfnMailManagerAddonInstance.Builder.create(this, id).apply(initializer).build()
