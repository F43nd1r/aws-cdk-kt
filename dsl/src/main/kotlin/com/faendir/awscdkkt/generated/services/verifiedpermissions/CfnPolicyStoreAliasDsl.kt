package com.faendir.awscdkkt.generated.services.verifiedpermissions

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.verifiedpermissions.CfnPolicyStoreAlias
import software.amazon.awscdk.services.verifiedpermissions.CfnPolicyStoreAliasProps
import software.constructs.Construct

@Generated
public fun Construct.cfnPolicyStoreAlias(
  id: String,
  props: CfnPolicyStoreAliasProps,
  initializer: @AwsCdkDsl CfnPolicyStoreAlias.() -> Unit = {},
): CfnPolicyStoreAlias = CfnPolicyStoreAlias(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnPolicyStoreAlias(id: String, initializer: @AwsCdkDsl CfnPolicyStoreAlias.Builder.() -> Unit = {}): CfnPolicyStoreAlias = CfnPolicyStoreAlias.Builder.create(this, id).apply(initializer).build()
