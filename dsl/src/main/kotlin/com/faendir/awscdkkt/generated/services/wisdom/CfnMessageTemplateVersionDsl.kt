package com.faendir.awscdkkt.generated.services.wisdom

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.wisdom.CfnMessageTemplateVersion
import software.amazon.awscdk.services.wisdom.CfnMessageTemplateVersionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnMessageTemplateVersion(
  id: String,
  props: CfnMessageTemplateVersionProps,
  initializer: @AwsCdkDsl CfnMessageTemplateVersion.() -> Unit = {},
): CfnMessageTemplateVersion = CfnMessageTemplateVersion(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnMessageTemplateVersion(id: String, initializer: @AwsCdkDsl
    CfnMessageTemplateVersion.Builder.() -> Unit = {}): CfnMessageTemplateVersion =
    CfnMessageTemplateVersion.Builder.create(this, id).apply(initializer).build()
