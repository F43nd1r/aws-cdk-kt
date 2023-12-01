package com.faendir.awscdkkt.generated.services.workspacesweb

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.workspacesweb.CfnIdentityProvider
import software.amazon.awscdk.services.workspacesweb.CfnIdentityProviderProps
import software.constructs.Construct

@Generated
public fun Construct.cfnIdentityProvider(
  id: String,
  props: CfnIdentityProviderProps,
  initializer: @AwsCdkDsl CfnIdentityProvider.() -> Unit = {},
): CfnIdentityProvider = CfnIdentityProvider(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnIdentityProvider(id: String, initializer: @AwsCdkDsl
    CfnIdentityProvider.Builder.() -> Unit = {}): CfnIdentityProvider =
    CfnIdentityProvider.Builder.create(this, id).apply(initializer).build()
