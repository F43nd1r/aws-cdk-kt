package com.faendir.awscdkkt.generated.services.verifiedpermissions

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.verifiedpermissions.CfnPolicyStore
import software.amazon.awscdk.services.verifiedpermissions.CfnPolicyStoreProps
import software.constructs.Construct

@Generated
public fun Construct.cfnPolicyStore(
  id: String,
  props: CfnPolicyStoreProps,
  initializer: @AwsCdkDsl CfnPolicyStore.() -> Unit = {},
): CfnPolicyStore = CfnPolicyStore(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnPolicyStore(id: String, initializer: @AwsCdkDsl
    CfnPolicyStore.Builder.() -> Unit = {}): CfnPolicyStore = CfnPolicyStore.Builder.create(this,
    id).apply(initializer).build()
