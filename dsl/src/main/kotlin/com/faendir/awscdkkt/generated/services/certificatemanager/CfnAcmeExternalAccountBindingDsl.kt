package com.faendir.awscdkkt.generated.services.certificatemanager

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.certificatemanager.CfnAcmeExternalAccountBinding
import software.amazon.awscdk.services.certificatemanager.CfnAcmeExternalAccountBindingProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAcmeExternalAccountBinding(
  id: String,
  props: CfnAcmeExternalAccountBindingProps,
  initializer: @AwsCdkDsl CfnAcmeExternalAccountBinding.() -> Unit = {},
): CfnAcmeExternalAccountBinding = CfnAcmeExternalAccountBinding(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnAcmeExternalAccountBinding(id: String, initializer: @AwsCdkDsl CfnAcmeExternalAccountBinding.Builder.() -> Unit = {}): CfnAcmeExternalAccountBinding = CfnAcmeExternalAccountBinding.Builder.create(this, id).apply(initializer).build()
