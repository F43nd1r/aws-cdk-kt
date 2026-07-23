package com.faendir.awscdkkt.generated.services.chime

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.chime.CfnAppInstanceUser
import software.amazon.awscdk.services.chime.CfnAppInstanceUserProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAppInstanceUser(
  id: String,
  props: CfnAppInstanceUserProps,
  initializer: @AwsCdkDsl CfnAppInstanceUser.() -> Unit = {},
): CfnAppInstanceUser = CfnAppInstanceUser(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnAppInstanceUser(id: String, initializer: @AwsCdkDsl CfnAppInstanceUser.Builder.() -> Unit = {}): CfnAppInstanceUser = CfnAppInstanceUser.Builder.create(this, id).apply(initializer).build()
