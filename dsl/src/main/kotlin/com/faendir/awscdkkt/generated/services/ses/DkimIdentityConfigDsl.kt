package com.faendir.awscdkkt.generated.services.ses

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ses.DkimIdentityConfig

@Generated
public fun buildDkimIdentityConfig(initializer: @AwsCdkDsl DkimIdentityConfig.Builder.() -> Unit =
    {}): DkimIdentityConfig = DkimIdentityConfig.Builder().apply(initializer).build()
